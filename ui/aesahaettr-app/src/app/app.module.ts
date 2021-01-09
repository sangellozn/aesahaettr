import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';


import { AppComponent } from './app.component';

import { ProgressSpinnerModule } from 'primeng/progressspinner';
import { InputTextModule } from 'primeng/inputtext';
import { ToastModule } from 'primeng/toast';

import { AppRoutingModule } from './app-routing.module';
import { HomeComponent } from './home/home.component';
import { PaysComponent } from './ref/pays/pays.component';
import { MessageService } from 'primeng/api';

@NgModule({
  declarations: [
    AppComponent,
    PaysComponent,
    HomeComponent
  ],
  imports: [
    AppRoutingModule,
    BrowserModule,
    BrowserAnimationsModule,
    HttpClientModule,
    ProgressSpinnerModule,
    InputTextModule,
    AppRoutingModule,
    ToastModule
  ],
  providers: [MessageService],
  bootstrap: [AppComponent]
})
export class AppModule { }
