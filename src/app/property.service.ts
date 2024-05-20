import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PropertyService {

  private baseUrl = 'http://localhost:8080/api/properties';
  getProperties: any;

  constructor(private http: HttpClient) {}

  getAllProperties(): Observable<any> {
    return this.http.get(this.baseUrl);
  }

  addProperty(property: any): Observable<any> {
    return this.http.post(this.baseUrl, property);
  }
}
