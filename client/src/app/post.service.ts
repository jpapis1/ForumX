import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import { Client } from './models/client';
import { Post } from './models/post';

import { Observable, of} from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class PostService {
  constructor(private http: HttpClient) { }

  getPosts(): Observable<any> {
    return this.http.get<Post>('http://localhost:8080/api/post');
  }
}
