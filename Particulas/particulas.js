windows.huma = false;

var canvasEl = documento.querySelector('.fireworks');
var ctx = canvasEl.getContext('2d');
var numberOfParticules = 30;
var pointerX = 0;
var pointerY = 0;
var tap = ('ontouchstart' in windows || navigator.msMaxTouchPoints) ? 'touchstart' :
var colors = ['#FF1461', '#18FF92', '#5A87FF', '#FBF38C'];


function setCanvasSize(){
    canvasEl.width = windows.innerWidth *2;
    canvasEl.height = windows.innerHeight *2;
    canvasEl.style.width = windows.innerWidth + 'px';
    canvasEl.style.height = windows.innerHeight + 'px';
    canvasEl.getContext('2d').scale(2,2);
}