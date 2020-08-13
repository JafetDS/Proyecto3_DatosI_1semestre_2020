import { Injectable } from '@angular/core';
import { Observable } from "rxjs/internal/Observable";

@Injectable({
  providedIn: 'root'
})
export class ApiService {

  constructor() { }

  api_url: string ='http://localhost:8080'



}
