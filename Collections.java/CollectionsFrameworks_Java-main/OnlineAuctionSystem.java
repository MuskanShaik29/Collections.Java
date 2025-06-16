import java.util.*;


class Bid {
    private String bidderName;
    private double bidAmount;

 
    public Bid(String bidderName, double bidAmount) {
        this.bidderName = bidderName;
        this.bidAmount = bidAmount;
    }

    
    public String getBidderName() {
        return bidderName;
    }

    public double getBidAmount() {
        return bidAmount;
    }

    @Override
    public String toString() {
        return "Bidder: " + bidderName + ", Amount: $" + bidAmount;
    }
}


class BidComparator implements Comparator<Bid> {
    @Override
    public int compare(Bid bid1, Bid bid2) {
        
        return Double.compare(bid2.getBidAmount(), bid1.getBidAmount());
    }
}


class AuctionSystem<T> {
    private PriorityQueue<Bid> bidQueue;

    
    public AuctionSystem() {
        
        bidQueue = new PriorityQueue<>(new BidComparator());
    }

    
    public void placeBid(Bid bid) {
        bidQueue.add(bid);
    }

   
    public Bid getHighestBid() {
        return bidQueue.peek();  

    
    public Bid closeAuction() {
        return bidQueue.poll();  
    
    public void displayAllBids() {
        if (bidQueue.isEmpty()) {
            System.out.println("No bids placed yet.");
        } else {
            System.out.println("Bids placed:");
            for (Bid bid : bidQueue) {
                System.out.println(bid);
            }
        }
    }
}

public class OnlineAuctionSystem {
    public static void main(String[] args) {
        
        AuctionSystem<Bid> auctionSystem = new AuctionSystem<>();

        
        auctionSystem.placeBid(new Bid("Alice", 250.0));
        auctionSystem.placeBid(new Bid("Bob", 320.5));
        auctionSystem.placeBid(new Bid("Charlie", 280.0));
        auctionSystem.placeBid(new Bid("Dave", 400.0));

        
        auctionSystem.displayAllBids();

        
        Bid highestBid = auctionSystem.getHighestBid();
        System.out.println("\nHighest bid before closing the auction: " + highestBid);

       
        System.out.println("\nClosing the auction...");
        Bid winner = auctionSystem.closeAuction();
        System.out.println("Winner: " + winner);
    }
}
