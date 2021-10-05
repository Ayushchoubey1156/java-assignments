import { Component, OnInit } from '@angular/core';
import { BookshelfserviceService } from '../bookshelfservice.service';

@Component({
  selector: 'app-book-container',
  templateUrl: './book-container.component.html',
  styleUrls: ['./book-container.component.css']
})
export class BookContainerComponent implements OnInit {

  book_list:any=[{
    title:"aa",
    author:"bb",
    language:"aac",
    cover:"http://placeimg.com/640/480"
  }];
  constructor(private bookshelfService: BookshelfserviceService)  { }


  ngOnInit(): void {
    this.bookshelfService.loadbooks().subscribe((data)=>{
      this.book_list=data;
      console.log(data);
    }, (err)=>{
      console.log("ERROR ="+err);
    });
  }

}
