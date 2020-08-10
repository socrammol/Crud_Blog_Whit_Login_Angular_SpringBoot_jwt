import { Injectable } from '@angular/core';
import { HttpClient, HttpRequest, HttpEvent, HttpHandler, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Component, OnInit } from '@angular/core';
import { TokenStorageService } from '../_services/token-storage.service'; 

@Injectable({
  providedIn: 'root'
})
export class UploadFilesService implements OnInit{
  currentUser: any;
  private baseUrl = 'http://localhost:8086/api/file';
  
  constructor(private http: HttpClient,
    private token: TokenStorageService) { }

  upload(file: File): Observable<HttpEvent<any>> {
    const formData: FormData = new FormData();
    
    formData.append('file', file);
    const head = new HttpHeaders()
    .set('Authorization','Bearer ' +this.token.getToken());
    const req = new HttpRequest('POST', `${this.baseUrl}/upload`, formData, {
      headers:head,
      reportProgress: true,
      responseType: 'json'
      
    });
    console.log(req)

    return this.http.request(req);
  }

  getFiles(): Observable<any> {
    const head = new HttpHeaders()
    .set('Authorization','Bearer' + this.token.getToken());

    return this.http.get(`${this.baseUrl}/files`,{
      headers:head,
    });
  }


  ngOnInit() {
    this.currentUser = this.token.getUser();
  }
}
