package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;

    // addItem
    public void addItem(Item item){
        // 한도 유효성 검증
        if(itemCount >= items.length){
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }
        items[itemCount] = item;
        itemCount++;
    }
    // displayItems
    public void displayItems(){
        System.out.println("장바구니 상품 출력");
        // 상품 출력
        for(int i = 0; i < itemCount; i++){
            Item item = items[i];
            System.out.println("상품명: " + item.getName() + ", 합계: " + item.getTotalPrice());
        }
        // 가격 합
        System.out.println("전체 가격 합: "+calculateTotalPrice());
    }

    // 가격 총합을 구하는 메서드
    private int calculateTotalPrice(){
        int totalPrice = 0;
        for(int i = 0; i < itemCount; i++){
            Item item = items[i];
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }
}
