import { NewScreenComponent } from './components/screens/new-screen/new-screen.component';
import { ListScreenComponent } from './components/screens/list-screen/list-screen.component';
import { DetailsScreenComponent } from './components/screens/details-screen/details-screen.component';
import { LoginScreenComponent } from './components/screens/login-screen/login-screen.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

const routes: Routes = [
  { path: '', redirectTo: '/login', pathMatch: 'full' },
  { path: 'login', component: LoginScreenComponent },
  { path: 'details/:id', component: DetailsScreenComponent },
  { path: 'list', component: ListScreenComponent },
  { path: 'new', component: NewScreenComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})


export class AppRoutingModule { }
