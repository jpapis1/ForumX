import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { ClientService } from './client.service';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ClientsComponent } from './clients/clients.component';
import { FormsModule } from '@angular/forms';
import { ClientDetailComponent } from './client-detail/client-detail.component';
import { MessagesComponent } from './messages/messages.component';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import { MaterialModule } from './material.module';
import { PostsComponent } from './posts/posts.component';
import { SidenavLayoutComponent } from './_layout/sidenav-layout/sidenav-layout.component';
import { BasicLayoutComponent } from './_layout/basic-layout/basic-layout.component';
import { RegistrationComponent } from './registration/registration.component';
import { LoginComponent } from './login/login.component';

@NgModule({
  declarations: [
    AppComponent,
    ClientsComponent,
    ClientDetailComponent,
    MessagesComponent,
    PostsComponent,
    SidenavLayoutComponent,
    BasicLayoutComponent,
    RegistrationComponent,
    LoginComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    BrowserAnimationsModule,
    MaterialModule
  ],
  providers: [ClientService],
  bootstrap: [AppComponent]
})
export class AppModule { }
