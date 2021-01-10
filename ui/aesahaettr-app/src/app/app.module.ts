import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { FormsModule } from '@angular/forms';


import { AppComponent } from './app.component';

import { ProgressSpinnerModule } from 'primeng/progressspinner';
import { InputTextModule } from 'primeng/inputtext';
import { ToastModule } from 'primeng/toast';
import { TableModule } from 'primeng/table';
import { ToolbarModule } from 'primeng/toolbar';
import { ButtonModule } from 'primeng/button';
import { DialogModule } from 'primeng/dialog';

import { AppRoutingModule } from './app-routing.module';
import { HomeComponent } from './home/home.component';
import { PaysComponent } from './ref/pays/pays.component';
import { MessageService } from 'primeng/api';
import { PageNotFoundComponent } from './not-found/page-not-found/page-not-found.component';

@NgModule({
  declarations: [
    AppComponent,
    PaysComponent,
    HomeComponent,
    PageNotFoundComponent
  ],
  imports: [
    AppRoutingModule,
    BrowserModule,
    BrowserAnimationsModule,
    HttpClientModule,
    ProgressSpinnerModule,
    InputTextModule,
    AppRoutingModule,
    ToastModule,
    TableModule,
    ToolbarModule,
    ButtonModule,
    DialogModule,
    FormsModule
  ],
  providers: [MessageService],
  bootstrap: [AppComponent]
})
export class AppModule { }
