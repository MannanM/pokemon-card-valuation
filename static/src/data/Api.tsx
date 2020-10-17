export class Api {
    private baseUrl: string;

    constructor(baseUrl: string = process.env.BASE_URL) {
        this.baseUrl = baseUrl;
    }

    getSets(): Promise<CardSet[]> {
        console.log('Fetching available set');
        return fetch(`${this.baseUrl}/api/sets.json`)
            .then(response => response.json())
            .then(data => {
                console.log(data);
                return data.sets;
            });
    }

    fetchCards(setValue: String): Promise<Map<string, CardData>> {
        console.log(`Set selected:`, setValue);
        return fetch(`${this.baseUrl}/api/${setValue}.json`)
            .then(response => response.json())
            .then(data => {
                console.log(data);
                return data;
            });
    }
}

export interface CardSet {
    name: String,
    value: String,
}

export interface CardData {
    name: string,
    type: string,
    data: any[]
}
