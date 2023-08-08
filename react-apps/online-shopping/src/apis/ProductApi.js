const productApiUrl = 'http://localhost:8888/api/products';

export const fetchProductsFromApi = async () => {
    const response = await fetch(productApiUrl);
    const data = await response.json();
    return data;
}

export const addProdctApi = async (product) => {
    const response = await fetch(productApiUrl, {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(product)
    });
    const data = await response.json();
    return data;
}