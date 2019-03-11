import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ClientsComponent } from './clients/clients.component';
import { PostsComponent } from './posts/posts.component';
import { SidenavLayoutComponent } from './_layout/sidenav-layout/sidenav-layout.component';
import { LoginComponent } from './login/login.component'
import { RegistrationComponent } from './registration/registration.component'

const routes: Routes = [
  {path: 'login', component: LoginComponent},
  {path: 'registration', component: RegistrationComponent},
  { 
    path: '', 
    component: SidenavLayoutComponent,
    children: [
      { path: 'clients', component: ClientsComponent, pathMatch: 'full'}
    ]
}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
