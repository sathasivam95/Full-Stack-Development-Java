import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Category } from './Category';

@Injectable({
  providedIn: 'root'
})
export class CategoryService {

  private apiServerUrl = '';

  constructor(private http: HttpClient) {}

  public getCategories(): Observable<Category[]>{
    return this.http.get<any>(`${this.apiServerUrl}/category/all`)
  }


  
}
