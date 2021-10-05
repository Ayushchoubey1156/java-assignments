import { Component, OnInit } from '@angular/core';
import { BookserviceService } from '../bookservice.service';

@Component({
  selector: 'app-bookcontainer',
  templateUrl: './bookcontainer.component.html',
  styleUrls: ['./bookcontainer.component.css']
})
export class BookcontainerComponent implements OnInit {

  constructor(private bookservice:BookserviceService) { }
  books:any={}
  ngOnInit(): void {
    this.bookservice.getBooks().subscribe((data)=>{
      this.books=data;
      console.log(data);
    }, (err)=>{
      console.log(err);
    });
  }

}
