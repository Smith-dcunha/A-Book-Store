@RestController
public class PurchaseController {

    @PostMapping("/purchase")
    public ResponseEntity<String> purchaseBook() {
        // Process the purchase logic here, e.g., update database, send confirmation email
        // ...

        // Simulate successful purchase for this example
        return ResponseEntity.ok("Purchase successful!");
    }
}