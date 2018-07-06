/*****
* CONFIGURATION
*/

/*
	dev: main.jsから共通パーツ用(主にナビ関連)を抜き出したものはmain_parts.jsへ移動
*/


/*
	dev: main_parts.jsへ
    //Main navigation
    $.navigation = $('nav > ul.nav');
*/

  $.panelIconOpened = 'icon-arrow-up';
  $.panelIconClosed = 'icon-arrow-down';

/*
	dev: main_parts.jsへ
  //Default colours
  $.brandPrimary =  '#20a8d8';
  $.brandSuccess =  '#4dbd74';
  $.brandInfo =     '#63c2de';
  $.brandWarning =  '#f8cb00';
  $.brandDanger =   '#f86c6b';

  $.grayDark =      '#2a2c36';
  $.gray =          '#55595c';
  $.grayLight =     '#818a91';
  $.grayLighter =   '#d1d4d7';
  $.grayLightest =  '#f8f9fa';

*/

'use strict';

/****
* MAIN NAVIGATION
*/

$(document).ready(function($){

/*
	dev: 元の main.js の内容を取り込み　↓
*/
	var fauxTable1 = document.getElementById("t1");
	var fauxTable2 = document.getElementById("t3");
	var mainTable = document.getElementById("main-table");
	if ( mainTable ) {
		var clonedElement1 = mainTable.cloneNode(true);
		var clonedElement2 = mainTable.cloneNode(true);
		clonedElement1.id = "";
		if ( fauxTable1 ) fauxTable1.appendChild(clonedElement1);
		clonedElement2.id = "";
		if ( fauxTable2 ) fauxTable2.appendChild(clonedElement2);
	}
/*
	dev: 元の main.js の内容を取り込み　↑
*/

/*
	dev: main_parts.jsへ

  // Add class .active to current link
  $.navigation.find('a').each(function(){

    var cUrl = String(window.location).split('?')[0];

    if (cUrl.substr(cUrl.length - 1) == '#') {
      cUrl = cUrl.slice(0,-1);
    }

    if ($($(this))[0].href==cUrl) {
 
//	dev: active と open はアプリ内で付与
//
//      $(this).addClass('active');
//
//      $(this).parents('ul').add(this).each(function(){
//        $(this).parent().addClass('open');
//      });
//
    }
  });

  // Dropdown Menu
  $.navigation.on('click', 'a', function(e){

    if ($.ajaxLoad) {
      e.preventDefault();
    }

    if ($(this).hasClass('nav-dropdown-toggle')) {
      $(this).parent().toggleClass('open');
      resizeBroadcast();
    }

  });

  function resizeBroadcast() {

    var timesRun = 0;
    var interval = setInterval(function(){
      timesRun += 1;
      if(timesRun === 5){
        clearInterval(interval);
      }
      window.dispatchEvent(new Event('resize'));
    }, 62.5);
  }
*/

  /* ---------- Main Menu Open/Close, Min/Full ---------- */
/*
	dev: main_parts.jsへ

  $('.navbar-toggler').click(function(){

    if ($(this).hasClass('sidebar-toggler')) {
      $('body').toggleClass('sidebar-hidden');
      resizeBroadcast();
    }

    if ($(this).hasClass('sidebar-minimizer')) {
      $('body').toggleClass('sidebar-minimized');
      resizeBroadcast();
    }

    if ($(this).hasClass('aside-menu-toggler')) {
      $('body').toggleClass('aside-menu-hidden');
      resizeBroadcast();
    }

    if ($(this).hasClass('mobile-sidebar-toggler')) {
      $('body').toggleClass('sidebar-mobile-show');
      resizeBroadcast();
    }
    
    $(this).find( "i" ).toggleClass('fa-angle-double-right');
    $(this).find( "i" ).toggleClass('fa-angle-double-left');

  });

  $('.sidebar-close').click(function(){
    $('body').toggleClass('sidebar-opened').parent().toggleClass('sidebar-opened');
  });

*/

  /* ---------- Disable moving to top ---------- */
  $('a[href="#"][data-top!=true]').click(function(e){
    e.preventDefault();
  });

});

/****
* CARDS ACTIONS
*/

$(document).on('click', '.card-actions a', function(e){
  e.preventDefault();

  if ($(this).hasClass('btn-close')) {
    $(this).parent().parent().parent().fadeOut();
  } else if ($(this).hasClass('btn-minimize')) {
    var $target = $(this).parent().parent().next('.card-block');
    if (!$(this).hasClass('collapsed')) {
      $('i',$(this)).removeClass($.panelIconOpened).addClass($.panelIconClosed);
    } else {
      $('i',$(this)).removeClass($.panelIconClosed).addClass($.panelIconOpened);
    }

  } else if ($(this).hasClass('btn-setting')) {
    $('#myModal').modal('show');
  }

});

function capitalizeFirstLetter(string) {
  return string.charAt(0).toUpperCase() + string.slice(1);
}

function init(url) {

  /* ---------- Tooltip ---------- */
  $('[rel="tooltip"],[data-rel="tooltip"]').tooltip({"placement":"bottom",delay: { show: 400, hide: 200 }});

  /* ---------- Popover ---------- */
  $('[rel="popover"],[data-rel="popover"],[data-toggle="popover"]').popover();

}