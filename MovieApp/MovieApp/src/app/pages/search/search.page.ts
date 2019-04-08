import { Component, OnInit } from '@angular/core';
import { NavController } from '@ionic/angular';
import { HttpClient } from '@angular/common/http';
import { Movie } from 'src/app/interfaces/Movie';
import { MovieDetailService } from 'src/app/services/MovieDetailService';

@Component({
  selector: 'app-search',
  templateUrl: './search.page.html',
  styleUrls: ['./search.page.scss'],
})
export class SearchPage implements OnInit {

  constructor(
    public navCtl: NavController,
    public httpClient: HttpClient,
    private mds: MovieDetailService
  ) {}

  searchQuery: String;

  ngOnInit() {}

  doSearch(): void {
    const apikey: String = '1dd34bde';
    const url = `http://www.omdbapi.com/?apikey=${apikey}&plot=short&r=json&t=${this.searchQuery}`;
    console.log(url);
    const movieJson = this.httpClient.get(url);
    movieJson.subscribe(data => {
      const movie: Movie = <Movie>data;
      if (movie.Response == 'True') {
        this.mds.setMovie(movie);
        this.navCtl.navigateRoot('detail');
      } else {
        alert(movie.Error);
      }
    });
  }


  async presentAlert(msg) {
    const alertController = document.querySelector('ion-alert-controller');
    await alertController.componentOnReady();

    const alert = await alertController.create({
      header: 'Alert',
      subHeader: 'Subtitle',
      message: 'This is an alert message. ' + msg,
      buttons: ['OK']
    });
    return await alert.present();
  }
}
