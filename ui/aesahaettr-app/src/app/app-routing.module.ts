import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { HomeComponent } from './home/home.component';
import { PageNotFoundComponent } from './not-found/page-not-found/page-not-found.component';
import { ObjetListComponent } from './objets/list/objet-list/objet-list.component';
import { ObjetFormComponent } from './objets/objet-form/objet-form.component';
import { ObjetComponent } from './objets/objet/objet.component';
import { PersonneListComponent } from './personnes/list/personne-list/personne-list.component';
import { PersonneFormComponent } from './personnes/personne-form/personne-form.component';
import { PersonneComponent } from './personnes/personne/personne.component';
import { PaysComponent } from './ref/pays/pays.component';
import { AppartenanceComponent } from './ref/type/appartenance/appartenance.component';
import { ContactComponent } from './ref/type/contact/contact.component';
import { LocalisationComponent } from './ref/type/localisation/localisation.component';
import { ObjetComponent as RefObjetComponent } from './ref/type/objet/objet.component';
import { RelationComponent } from './ref/type/relation/relation.component';

const routes: Routes = [
  { path: '', redirectTo: '/home', pathMatch: 'full' },
  { path: 'home', component: HomeComponent} ,
  { path: 'ref/pays', component:  PaysComponent },
  { path: 'ref/type/appartenance', component: AppartenanceComponent },
  { path: 'ref/type/contact', component: ContactComponent },
  { path: 'ref/type/localisation', component: LocalisationComponent },
  { path: 'ref/type/objet', component: RefObjetComponent },
  { path: 'ref/type/relation', component: RelationComponent },
  { path: 'personnes', component: PersonneListComponent },
  { path: 'personnes/new', component: PersonneFormComponent },
  { path: 'personnes/:id/edit', component: PersonneFormComponent },
  { path: 'personnes/:id', component: PersonneComponent },
  { path: 'objets', component: ObjetListComponent },
  { path: 'objets/new', component: ObjetFormComponent },
  { path: 'objets/:id', component: ObjetComponent },
  { path: 'objets/:id/edit', component: ObjetFormComponent },
  { path: '**', component: PageNotFoundComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
