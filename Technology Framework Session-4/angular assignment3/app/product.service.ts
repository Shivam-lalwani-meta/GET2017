import { Injectable } from '@angular/core'
import { Product } from './Product'

import { Headers, Http } from '@angular/http';

import 'rxjs/add/operator/toPromise';

@Injectable()
export class ProductService {
    private headers = new Headers({ 'Content-Type': 'application/json' });
    private productUrl = 'api/PRODARRAY';  // URL to web api

    constructor(private http: Http) { }

    getProducts(): Promise<Product[]> {
        return this.http.get(this.productUrl)
            .toPromise()
            .then(response => response.json().data as Product[])
            .catch(this.handleError);
    }


    delete(id: number): Promise<void> {
        const url = `${this.productUrl}/${id}`;
        return this.http.delete(url, { headers: this.headers })
            .toPromise()
            .then(() => null)
            .catch(this.handleError);
    }

    create(title: string, price: number): Promise<Product> {
        return this.http
            .post(this.productUrl, JSON.stringify({ title: title, price: price }), { headers: this.headers })
            .toPromise()
            .then(res => res.json().data as Product)
            .catch(this.handleError);
    }


    update(prod: Product): Promise<Product> {
        const url = `${this.productUrl}/${prod.id}`;
        return this.http
            .put(url, JSON.stringify(prod), { headers: this.headers })
            .toPromise()
            .then(() => prod)
            .catch(this.handleError);
    }

    private handleError(error: any): Promise<any> {
        console.error('An error occurred', error); // for demo purposes only
        return Promise.reject(error.message || error);
    }

    getProduct(id: number): Promise<Product> {
        const url = `${this.productUrl}/${id}`;
        return this.http.get(url)
            .toPromise()
            .then(response => response.json().data as Product)
            .catch(this.handleError);
    }
}