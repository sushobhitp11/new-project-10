import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BaselistctlComponent } from './baselistctl/baselistctl.component';
import { BaseListCtlComponent } from './base-list-ctl/base-list-ctl.component';

@NgModule({
  declarations: [
    AppComponent,
    BaselistctlComponent,
    BaseListCtlComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
