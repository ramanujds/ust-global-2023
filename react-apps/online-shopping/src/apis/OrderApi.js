export const fetchOrdersFromApi = async () => {
    const response = await fetch('http://localhost:8888/api/orders');
    const data = await response.json();
    console.log(data);
    return data;
}

export const addOrderToApi = async (order) => {
    const response = await fetch('http://localhost:8888/api/orders', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(order)
    });
    const data = await response.json();
    return data;
}

