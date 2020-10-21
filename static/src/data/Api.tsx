export class Api {
    private baseUrl: string;

    constructor(baseUrl: string = process.env.BASE_URL) {
        this.baseUrl = baseUrl;
    }

    getExpansions(): Promise<Expansion[]> {
        console.log('Fetching available set');
        return fetch(`${this.baseUrl}/api/sets.json`)
            .then(response => response.json())
            .then(data => {
                console.log(data);
                return data.expansions;
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

export interface Expansion {
    name: String,
    sets: CardSet[],
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
