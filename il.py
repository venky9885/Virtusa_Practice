# min cost to build N blocks
def minCost(n, x, y, z):
    dp = [0] * (n + 1)
    dp[0] = dp[1] = 0

    for i in range(2, n + 1):

        if (i % 2 == 1):
            dp[i] = min(dp[(i + 1) // 2] + x + z, dp[i - 1] + y)

        else:
            dp[i] = min(dp[i // 2] + x, dp[i - 1] + y)

    return dp[n]


n = int(input())
x, y, z = map(int, input().split(" "))
print(minCost(n, x, y, z))


# n = 3
# for i in range(1, n+1):
#     # tt = 0c
#     # if(i % 2 == 0):
#     #     tt = i+(i//2)+1
#     # else:
#     #     tt = i+(i//2)
#     for j in range(1, i+1):
#         if(j % 2 == 0):
#             print("*"+str(i), end="")
#         else:
#             print(i, end="")
#     print()

# def print_pattern(n):
#     for i in range(1, n+1):
#         for j in range(n, 0, -1):
#             if(i == j):
#                 print("*", end="")
#             else:
#                 print(j, end="")
#         print()


# n = int(input())
# print_pattern(n)


# def upper(row, col):

#     for i in range(0, row):

#         for j in range(0, col):

#             if (i+1 > j):
#                 print("*", end="")

#             else:
#                 print("#",
#                       end=" ")

#         print()


# n = int(input())
# upper(n, n)
