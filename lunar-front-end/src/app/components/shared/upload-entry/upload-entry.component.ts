import {COMMA, ENTER} from '@angular/cdk/keycodes';
import {Component} from '@angular/core';
import {MatChipInputEvent} from '@angular/material/chips';

export interface Tag {
  name: string;
}

interface Secure {
  value: string;
  viewValue: string;
}

@Component({
  selector: 'app-upload-entry',
  templateUrl: './upload-entry.component.html',
  styleUrls: ['./upload-entry.component.scss']
})
export class UploadEntryComponent {

  selectable = true;
  removable = true;
  addOnBlur = true;
  readonly separatorKeysCodes = [ENTER, COMMA] as const;
  tags: Tag[] = [
    {name: 'Deep Space'},
    {name: 'Temperature'}
  ];

  secs: Secure[] = [
    {value: 'public', viewValue: 'Public'},
    {value: 'private', viewValue: 'Private'}
  ];

  add(event: MatChipInputEvent): void {
    const value = (event.value || '').trim();

    // Add our fruit
    if (value) {
      this.tags.push({name: value});
    }

    // Clear the input value
    event.chipInput!.clear();
  }

  remove(tag: Tag): void {
    const index = this.tags.indexOf(tag);

    if (index >= 0) {
      this.tags.splice(index, 1);
    }
  }

}
