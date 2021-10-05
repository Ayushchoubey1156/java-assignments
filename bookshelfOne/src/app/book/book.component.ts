import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-book',
  templateUrl: './book.component.html',
  styleUrls: ['./book.component.css']
})
export class BookComponent implements OnInit {


  @Input() title="Bookname";
  @Input() author="Author";
  @Input() lang="Lang";
  @Input() cover="cover";
  constructor() { }

  ngOnInit(): void {
  }

}
