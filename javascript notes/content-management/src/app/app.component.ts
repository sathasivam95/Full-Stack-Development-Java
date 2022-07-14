import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Post } from './Post';
import { PostService } from './post.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{

  title = 'content-management';
  public posts!: Post[];

  ngOnInit(){
    this.getPosts();
  }

  // Injection
  constructor(private postService: PostService) {}
  
 public getPosts(): void {
  this.postService.getPosts().subscribe(
    (response: Post[]) => {
      this.posts = response;
    },(error: HttpErrorResponse) => {
      alert(error.message);
    }
  );
 }
 
}
