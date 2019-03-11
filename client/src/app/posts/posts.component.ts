import { Component, OnInit } from '@angular/core';
import { Post } from '../models/post';
import { PostService } from '../post.service';

@Component({
  selector: 'app-posts',
  templateUrl: './posts.component.html',
  styleUrls: ['./posts.component.less']
})
export class PostsComponent implements OnInit {
  posts: Array<any>;

  selectedPost : Post;
  constructor(private postService : PostService) { }

  onSelect(post: Post): void {
    this.selectedPost = post;
  }
  getPosts(): void {
    this.postService.getPosts().subscribe(posts => this.posts = posts);
  }

  ngOnInit() {
    this.getPosts();
  }

}
