import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

const BASIC_URL = ["http://localhost:8080"];

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  constructor(private http: HttpClient) { }

  postEmployee(employee: any): Observable<any> {
    return this.http.post(BASIC_URL + "/api/employee_management/save", employee);
  }

  getAllEmployee():Observable<any>{
    return this.http.get(BASIC_URL + "/api/employee_management/getRecord");
  }

  getEmployeeById(id: number):Observable<any>{
    return this.http.get(BASIC_URL + "/api/employee_management/getRecordById/" + id);
  }

  updateEmployee(id: number, employee:any):Observable<any>{
    return this.http.put(BASIC_URL + "/api/employee_management/update/" + id, employee);
  }

  deleteEmployee(id: number):Observable<any>{
    return this.http.delete(BASIC_URL + "/api/employee_management/delete/" + id);
  }
}
