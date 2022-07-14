import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Post } from './Post';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class PostService {

  private apiServerUrl = environment.apiBaseUrl;

  constructor(private http: HttpClient) {}

  // get posts
  public getPosts(): Observable<Post[]>{
    return this.http.get<any>(`${this.apiServerUrl}/post/all`);
  }

  // add posts
  public addPosts(post: Post): Observable<Post[]>{
    return this.http.post<any>(`${this.apiServerUrl}/post/add`, post);
  }

   // update posts
   public updatePosts(post: Post): Observable<Post[]>{
    return this.http.put<any>(`${this.apiServerUrl}/post/update`, post);
  }

   // delete an old posts?
   public deletePosts(id: number): Observable<void>{
    return this.http.delete<void>(`${this.apiServerUrl}/post/delete/${id}}`);
  }


  
}
