// KeyPair Class
PrivateKey privateKey;
PublicKey publicKey;

//Main
public static KeyPair genKeyPair()

//Additional
public void printKeyPair()

//Signature class
//Main
public static byte[] signData(PrivateKey priv, String message)
public static boolean verifySignature(byte[] realSig, String message, PublicKey publicKey)

//Additional
public static void printSignature(Signature)


// Implementation of the Acount class
//Account
String accountID;
ArrayList<KeyPair> wallet;
int balance;


// Main
public static Account getAccount()
public void addKeyPairToWallet(KeyPair pair)
public void updateBalance(int balance)
public int getBalance()
public void printBalance()
public byte[] signData (String message, int index)
public Operation createOperation (Account recipient, int amount, int index)

// Additional
public String toString()
public void print()

// Implementation of the Operation and Transaction classess

//Operation
Account Sender;
Account receiver;
int amount;
byte[] signature;

//Main
public static Operation createOperation(Account Sender, Account receiver, int amount, byte[] signature)
public static boolean verifyOperation(Operation operation)

//Additional
public String toString()
public void print()


//Transactions
String transactionID;
ArrayList<Operation> setOperations;
int nonce;


//Main
public static Transaction createTransaction (ArrayList<Operation> setOperations, int nonce)

//Additional
public String toString()
public void print()


//Implementation of the Hash , Block and Blockchain classes
//HAsh
//Main
public static String toSHA1(String message)


//Block
String blockID;
String prevHash;
ArrayList<Transaction> setOfTransaction;


//Main
public static Block createBlock (ArrayList<Transaction> setOfTransaction, String prevHash)


//Additional
public String toString()
public void print()



//Blockchain Classes
HashMap<Account, Integer> coinDatabase;
ArrayList<Block> blockHistory;
ArrayList<Transaction> txDatabase;
int faucetCoins;


//Main
public static Blockchain intBlockchain()
public void getTokenFromFaucet(Account account, int amount)
public void validateBlock(Block block)
public void showCoinDatabase()

//Additional
public String toString()
public void print()