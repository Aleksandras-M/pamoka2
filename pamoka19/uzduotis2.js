window.onload = function () {

    let trikampis1 = {id: 1, a: 3, b: 4, c: 5, plotas: 0, perimetras: 0 };
    let trikampis2 = {id: 2, a: 7, b: 9, c: 12, plotas: 0, perimetras: 0 };

    trikampis1.plotas = plotasHeronoFormule(trikampis1.a, trikampis1.b, trikampis1.c);
    trikampis2.plotas = plotasHeronoFormule(trikampis2.a, trikampis2.b, trikampis2.c);
    trikampis1.perimetras = trikampioPerimetras(trikampis1);
    trikampis2.perimetras = trikampioPerimetras(trikampis2);

    alert(trikampioIsvedimasFormatuotas(trikampis1));

    console.log(`Trikampio plotas didesnis už perimetrą: ${arPlotasDidesnisUzPerimetra(trikampis1)}`);

    // console.log(trikampis1);
    // console.log(trikampis2);
    console.log(`pirmo trikampio plotas yra didesnis, grąžina -1, jeigu jie lygūs, grąžina 0, jeigu antro didesnis, grąžina 1\n${trikampioPlotuPalyginimas(trikampis1, trikampis2)}`);

    
}

function plotasHeronoFormule(a, b, c) {
    let p = (a + b + c) / 2;
    return Math.sqrt(p * (p - a) * (p - b) * (p - c));
}

function trikampioIsvedimasFormatuotas(trikampis){
    return `${trikampis.id}-as trikampis \nTrikampio kraštinių ilgiai: ${trikampis.a}, ${trikampis.b}, ${trikampis.c} \nTrikampio plotas ${trikampis.plotas} \nTrikampio perimetras ${trikampis.perimetras}`
}

function arPlotasDidesnisUzPerimetra(trikampis){
    return trikampis.plotas > trikampis.perimetras;
}

function trikampioPlotuPalyginimas(trikampis1, trikampis2){
    // if (trikampis1.plotas > trikampis2.plotas){
    //     return "-1";
    // } else if(trikampis1.plotas == trikampis2.plotas){
    //     return "0"
    // } else {
    //     return "1"
    // }
    return trikampis1.plotas > trikampis2.plotas ? "-1" : trikampis1.plotas == trikampis2.plotas ? "0" : "1"
}

function trikampioPerimetras(trikampis){
    return trikampis.a + trikampis.b + trikampis.c;
}