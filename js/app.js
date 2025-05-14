  document.querySelector('form').addEventListener('submit', function(event) {
  event.preventDefault();
  var dateInput = document.getElementById('data_nascimento').value;
  if (dateInput) {
  var date = new Date(dateInput);
  var day = date.getDate().toString().padStart(2, '0');
  var month = (date.getMonth() + 1).toString().padStart(2, '0');
  var year = date.getFullYear();

  var formattedDate = day + '/' + month + '/' + year;
  alert('Data formatada: ' + formattedDate);

}
});

