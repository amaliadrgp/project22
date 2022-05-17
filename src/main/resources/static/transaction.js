$(document).ready(()=>{
     $('#add-transaction-button').click(()=>{
       const product = $('#modal-transaction-product').val();
       const amount = $('#modal-transaction-amount').val();
       const type = $('#modal-transaction-type').val();

       fetch('/api/transactions', {
        method:'POST',
        body:JSON.stringify({
           product: product,
           amount: amount,
           type: type
        }),
            headers: {
               'Content-Type': 'application/json'
            }
       }).then(response => {
       if(response.ok){
            location.reload();
            }else{
               alert("There were errors" + response.status);
            }
       });
      $('.delete-icon').click(function () {
           const transactionId = this.parentElement.id;
           fetch(`api/transactions/${transactionId}`, {
               method: 'DELETE'
           }).then(response => location.reload());
       });
});