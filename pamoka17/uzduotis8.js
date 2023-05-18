window.onload = function(){

    const masyvas = [5, 12, 3, 6, 8, 14, 15, 5, 6, 10];
    let intervaloPradzia = 10;
    let intervaloPabaiga = 14;
    console.log(kiekPriklausoIntervalui(masyvas, intervaloPradzia, intervaloPabaiga));
}

function kiekPriklausoIntervalui(masyvas, a, b){
    debugger;
    let counter = 0;
    for(let i = 0; i < masyvas.length; i++){
        if(masyvas[i] >= a && masyvas[i] <= b)
        counter += 1;
    }
    return counter;
}