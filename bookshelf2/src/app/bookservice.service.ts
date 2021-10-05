import { HttpClient, HttpClientModule } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class BookserviceService {

  constructor(private httpclient : HttpClient) { }

  public getBooks(){
    return this.httpclient.get("https://61556db993e3550017b089c3.mockapi.io/bookshelf-api/bookshelfapi");
  }

}
