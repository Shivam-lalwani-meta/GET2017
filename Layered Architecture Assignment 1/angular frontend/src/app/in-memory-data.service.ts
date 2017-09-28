import { InMemoryDbService } from 'angular-in-memory-web-api';
export class InMemoryDataService implements InMemoryDbService {
  createDb() {
    const PRODARRAY = [
      { id: 11, title: 'Nike' , price: 999 , source: 'https://images.eastbay.com/pi/04764102/large/nike-cortez-boys-grade-school' },
      { id: 12, title: 'Levis', price: 2299 , source: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ7-KNPnG5CRMeX5AQV45h9Zuahfk5KtGQfxa_Ezr95Bz7M26VOFw'},
      { id: 13, title: 'Bata', price: 1299 , source: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRJPuueTbipQ6hUCeqXN_dkEBHpe2hOW7yqvWsfJMiO9Bc01PJo1Q'},
      { id: 14, title: 'Puma', price: 1799 , source: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTJxtDiOPzXX93XhCQ4m5eo9Rb2VDcu7svgpNP8uhUNckZpziLibw'},
      { id: 15, title: 'Sony', price: 1399 , source: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTFPXG5KQ-MDIHTtuxyq1EpGw9ei98QeDe0zVP32PEz0Zze8fHO-A'},
      { id: 16, title: 'Reebok', price: 1799 , source: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSZFeOsfk3Va3EkaKBgUF7hRbFNmVQInr7Y7h_dKbNuW_ZVQu4i'},
      { id: 17, title: 'Spykar', price: 1499 , source: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTTgP01EiofRMcyRIGtF8jd3sCSsJtyTOHGIlvecTWfrj-sNjap'},
      { id: 18, title: 'LP', price: 1599 , source: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRQF21Xt8NSZSIcO9AqdX0vt6JfIZvVWgCYaal6lH5EQdR5clqd9w'},
    ];
    return {PRODARRAY};
  }
}
