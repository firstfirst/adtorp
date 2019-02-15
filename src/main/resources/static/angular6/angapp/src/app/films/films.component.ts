import { Component, OnInit } from '@angular/core';

import { Film } from '../film';
import { FilmService } from '../film.service';

@Component({
  selector: 'app-films',
  templateUrl: './films.component.html',
  styleUrls: ['./films.component.css']
})
export class FilmsComponent implements OnInit {

filmList: Film[];
constructor(private filmService: FilmService) { }

  ngOnInit() {
    this.getFilms();
  }

  getFilms(): void {
    this.filmService.getFilmes()
    .subscribe(response => this.filmList = response);
  }

}
