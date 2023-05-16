window.onload = function() {

    let n = +prompt(`Įveskite sekos skaičiaus numerį`);
    console.log(fibonnaciSkaicius(n));
}

function fibonnaciSkaicius(n){
    if (n === 1) {
        return 0;
      } else if (n === 2) {
        return 1;
      } else {
        let x = 0;
        let y = 1;
        let sekantisSkaicius = 0;
        for (let i = 3; i <= n; i++) {
        sekantisSkaicius = x + y;
          x = y;
          y = sekantisSkaicius;
        }
        return sekantisSkaicius;
    }

}