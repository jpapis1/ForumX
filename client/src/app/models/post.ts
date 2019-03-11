import { Client } from './client';

export class Post {
    idPost : number;
    name : string;
    content : string;
    dateOfCreation : Date;
    creator : Client
}