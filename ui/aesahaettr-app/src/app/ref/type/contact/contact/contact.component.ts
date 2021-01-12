import { Component, OnInit } from '@angular/core';
import { GenericRefType } from 'src/app/bean/ref/type/generic-ref-type';
import { RefTypeContactService } from 'src/app/services/ref/type/ref-type-contact.service';

@Component({
  selector: 'app-contact',
  templateUrl: './contact.component.html',
  styleUrls: ['./contact.component.css']
})
export class ContactComponent implements OnInit {

  contactList: GenericRefType[] = [];

  nouveauTypeContact: GenericRefType = new GenericRefType;

  showAddNouveauTypeContactPopin: boolean = false;

  modification: boolean = false;

  constructor(private refTypeContactService: RefTypeContactService) { }

  ngOnInit(): void {
    this.loadRefTypeContact();
  }

  loadRefTypeContact(): void {
    this.refTypeContactService.findAll().subscribe(data => this.contactList = data);
  }

  onNouveauTypeContactBtnClick(): void {
    this.showAddNouveauTypeContactPopin = true;
  }

  onNouveauTypeContactPopinCancelBtnClick(): void {
    this.showAddNouveauTypeContactPopin = false;
    this.nouveauTypeContact = new GenericRefType;
    this.modification = false;
  }

  onContactFormSubmit(): void {
    this.refTypeContactService.save(this.nouveauTypeContact)
      .subscribe(() => {
        this.showAddNouveauTypeContactPopin = false;
        this.loadRefTypeContact();
        this.nouveauTypeContact = new GenericRefType;
        this.modification = false;
      });
  }

  editContact(refTypeContact: GenericRefType) {
    this.nouveauTypeContact = {...refTypeContact};
    this.modification = true;
    this.showAddNouveauTypeContactPopin = true;
  }

  onHideNouveauTypeContactPopin() {
    this.onNouveauTypeContactPopinCancelBtnClick();
  }

}
