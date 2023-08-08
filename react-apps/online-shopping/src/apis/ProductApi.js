export const fetchProductsFromApi = async () => {
    fetch('http://localhost:8888/api/products')
    .then(response => response)
    .catch(error => {
        console.log(error);
    }
    );
}