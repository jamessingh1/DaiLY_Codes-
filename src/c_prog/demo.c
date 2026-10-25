#include <stdio.h>
#include <stdlib.h>

int seats[6] = {0, 0, 0, 0, 0, 0};
int bookedCount = 0;

int waitlist[10];
int front = -1;
int rear = -1;

int isQueueEmpty() {
    if (front == -1 || front > rear) {
        return 1;
    }
    return 0;
}

int isQueueFull() {
    if (rear == 9) {
        return 1;
    }
    return 0;
}

void enqueue(int passengerID) {
    if (isQueueFull()) {
        printf("Waiting List Queue is FULL!\n");
        return;
    }
    if (front == -1) {
        front = 0;
    }
    rear++;
    waitlist[rear] = passengerID;
    printf("All seats booked! Passenger ID %d added to WAITING LIST QUEUE at Position #%d.\n", 
           passengerID, (rear - front + 1));
}

int dequeue() {
    if (isQueueEmpty()) {
        return -1;
    }
    int passengerID = waitlist[front];
    front++;
    
    if (front > rear) {
        front = -1;
        rear = -1;
    }
    return passengerID;
}

void bookTicket(int *passengerID) {
    if (bookedCount < 6) {
        int selectedSeat;

        printf("\nCurrent Seat Availability:\n");
        for (int i = 0; i < 6; i++) {
            if (seats[i] == 0) {
                printf("Seat %d: [ VACANT ]\n", i + 1);
            } else {
                printf("Seat %d: [ BOOKED by ID %d ]\n", i + 1, seats[i]);
            }
        }

        printf("\nSelect your seat number (1-6): ");
        scanf("%d", &selectedSeat);

        if (selectedSeat < 1 || selectedSeat > 6) {
            printf("Invalid seat number!\n");
        } 
        else if (seats[selectedSeat - 1] != 0) {
            printf("Seat %d is already booked!\n", selectedSeat);
        } 
        else {
            seats[selectedSeat - 1] = *passengerID;
            printf("SUCCESS! Seat %d booked for Passenger ID: %d\n", selectedSeat, *passengerID);
            (*passengerID)++;
            bookedCount++;
        }
    } 
    else {
        enqueue(*passengerID);
        (*passengerID)++;
    }
}

void cancelTicket() {
    int cancelID;
    int foundSeatIndex = -1;

    if (bookedCount == 0) {
        printf("No confirmed tickets available to cancel!\n");
        return;
    }

    printf("Enter Passenger ID to cancel: ");
    scanf("%d", &cancelID);

    for (int i = 0; i < 6; i++) {
        if (seats[i] == cancelID) {
            foundSeatIndex = i;
            break;
        }
    }

    if (foundSeatIndex == -1) {
        printf("Passenger ID %d not found in confirmed seats!\n", cancelID);
        return;
    }

    printf("Ticket for Passenger ID %d at Seat %d has been CANCELLED.\n", cancelID, foundSeatIndex + 1);

    if (!isQueueEmpty()) {
        int promotedPassenger = dequeue();
        seats[foundSeatIndex] = promotedPassenger;
        printf("AUTO-ALLOCATION: Passenger ID %d moved from Waiting List Queue to Seat %d!\n", 
               promotedPassenger, foundSeatIndex + 1);
    } 
    else {
        seats[foundSeatIndex] = 0;
        bookedCount--;
        printf("Seat %d is now VACANT.\n", foundSeatIndex + 1);
    }
}

void displayStatus() {
    printf("\nSYSTEM STATUS:\n");
    printf("CONFIRMED SEATS (%d/6 Booked):\n", bookedCount);
    for (int i = 0; i < 6; i++) {
        if (seats[i] == 0) {
            printf("  Seat %d ---> [ VACANT ]\n", i + 1);
        } else {
            printf("  Seat %d ---> Passenger ID %d\n", i + 1, seats[i]);
        }
    }

    printf("\nWAITING LIST QUEUE:\n");
    if (isQueueEmpty()) {
        printf("  [ Queue is Empty ]\n");
    } else {
        int pos = 1;
        for (int i = front; i <= rear; i++) {
            printf("  Queue Pos %d ---> Passenger ID %d\n", pos, waitlist[i]);
            pos++;
        }
    }
    printf("\n");
}

int main() {
    int choice;
    int currentPassengerID = 101;

    while (1) {
        printf("\n TRAIN TICKET RESERVATION SYSTEM \n");
        printf("1. Book Ticket / Allotment\n");
        printf("2. Cancel Ticket\n");
        printf("3. Display Status\n");
        printf("4. Exit\n");
        printf("Enter your choice (1-4): ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                bookTicket(&currentPassengerID);
                break;
            case 2:
                cancelTicket();
                break;
            case 3:
                displayStatus();
                break;
            case 4:
                printf("Exiting program...\n");
                return 0;
            default:
                printf("Invalid choice! Please enter 1, 2, 3, or 4.\n");
        }
    }

    return 0;
}