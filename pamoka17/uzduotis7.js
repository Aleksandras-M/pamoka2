window.onload = function() {

    const masyvas = [5, 12, 3, 6, 8, 14, 15, 5, 6, 10];
    console.log(lyginiaiSkaiciaiMasyve(masyvas));
}

function lyginiaiSkaiciaiMasyve(masyvas){
    const naujasMasyvas = [];
    for (let i = 0; i < masyvas.length; i++) {
        if(masyvas[i] % 2 == 0){
            naujasMasyvas.push(masyvas[i]);
        }
    }
    return naujasMasyvas;
}