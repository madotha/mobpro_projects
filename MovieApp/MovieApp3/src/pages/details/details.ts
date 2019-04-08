import {Component} from '@angular/core';
import {NavController, NavParams} from 'ionic-angular';


@Component({
  selector: 'page-details',
  templateUrl: 'details.html'
})
export class DetailPage {

  title:string;
  year:string;
  director:string;
  country:string;
  plot:string;
  poster:string;

  constructor(public navCtrl: NavController, navParams:NavParams) {
    this.title = navParams.get('Title');
    this.year = navParams.get('Year');
    this.director = navParams.get('Director');
    this.country = navParams.get('Country');
    this.plot = navParams.get('Plot');
    this.poster = navParams.get('Poster');

  }

}
