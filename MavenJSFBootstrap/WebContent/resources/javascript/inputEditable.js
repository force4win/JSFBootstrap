package com.corejsf;
   var com = {};

if (!com.clarity) {
   com.clarity = {
      init: function (ccid) {
         var mydiv = document.getElementById(ccid);
         mydiv.editButton = $(mydiv.id + ':editButton');
         mydiv.text = $(mydiv.id + ':text');
         mydiv.editableText = $(mydiv.id + ':editableText');
         mydiv.doneButton = $(mydiv.id + ':doneButton');
         mydiv.doneButton.offsetLeft = mydiv.editButton.offsetLeft;
           
         mydiv.editButton.startEditing = function() {
           mydiv.text.fade( { duration: 0.25 } );
           mydiv.editButton.fade( { duration: 0.25 } );
      
           window.setTimeout( function() {
              mydiv.editableText.appear( { duration: 0.25 } );
              mydiv.doneButton.appear( { duration: 0.25 } );
      
               window.setTimeout( function() { 
                  mydiv.editableText.focus(); 
               }, 300); 
            }, 300); 
         };
      },
   
      toggleDisplay: function(element) {
         element.style.display = element.style.display == "none" ? "" : "none"; 
      },
           
      ajaxExecuting: function(data) {
         var mydiv = $(data.source.parentNode);
      
         if (data.status == 'complete') {
            toggleDisplay(mydiv.editableText);
            toggleDisplay(mydiv.doneButton);
            toggleDisplay(mydiv.text);
            toggleDisplay(mydiv.editButton);
         }
      }
   }
}