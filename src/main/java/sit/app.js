//import Logger from '/node_modules/color-logger';

const logger = require('node-color-log');
// simple usage
// normal log
logger.log("шрек-это жизнь")
// Attribute log
logger.color('red').bgColor('blue')
    .bold().italic().dim().reverse().underscore().strikethrough()
    .log("шрек-это любовь");
// only set font color
logger.fontColorLog('red', "шрека много не бывает");
// only set background color
logger.bgColorLog('green', "даже текст зеленый стал..");
// set font and background color
logger.colorLog({
    font: 'black',
    bg: 'yellow'
}, "вот это лог, понимаю");