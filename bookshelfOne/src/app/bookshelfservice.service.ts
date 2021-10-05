import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class BookshelfserviceService {

  constructor(private http:HttpClient) { }

  public loadbooks(){
   return this.http.get("https://61556db993e3550017b089c3.mockapi.io/bookshelf-api/bookshelfapi");
  }
}
