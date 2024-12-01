$(document).ready(function(){
   
    $('.detail-item-img').hover(function(){

    
       var url = $(this).attr('src');

       console.log(url);

       $('#main-item-img').attr('src',url);
    });

    
}); 