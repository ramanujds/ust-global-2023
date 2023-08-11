export const fetchCartItemsFromApi = async () => {
    const response = await fetch('http://localhost:8888/api/cart/items');
    try{
    const data = await response.json();
    return data;
    }
    catch(error){
        return null;
    }

        
}
export const addCartItemToApi = async (productId) => {
    const response = await fetch('http://localhost:8888/api/cart/items/product/'+productId, {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        }
    });
    const data = await response.json();
    return data;
}
export const deleteCartItemFromApi = async (productId) => {
    const response = await fetch('http://localhost:8888/api/cart/items/product/'+productId, {
        method: 'DELETE'
    });
    const data = await response.json();
    return data;
}
