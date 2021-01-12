import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { HomeComponent } from './home/home.component';
import { PageNotFoundComponent } from './not-found/page-not-found/page-not-found.component';
import { PaysComponent } from './ref/pays/pays.component';
import { AppartenanceComponent } from './ref/type/appartenance/appartenance.component';
import { ContactComponent } from './ref/type/contact/contact/contact.component';

const routes: Routes = [
  { path: '', redirectTo: '/home', pathMatch: 'full' },
  { path: 'home', component: HomeComponent} ,
  { path: 'ref/pays', component:  PaysComponent },
  { path: 'ref/type/appartenance', component: AppartenanceComponent },
  { path: 'ref/type/contact', component: ContactComponent },
  { path: '**', component: PageNotFoundComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
