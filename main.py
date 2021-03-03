import timeit
import matplotlib.pyplot as plt

module = "from math import sqrt\n"

algo1 ="""
def algorithm_first(n):
    c = list(True for i in range(n))
    c[1] = False
    n = len(c) - 1
    i = 2
    while i <= n:
        if c[i]:
            j = 2 * i
            while j <= n:
                c[j] = False
                j += i
        i += 1
"""

algo2 = """
def algorithm_second(n):
    c = list(True for i in range(n))
    c[1] = False
    n = len(c) - 1
    i = 2
    while i <= n:
        j = 2 * i
        while j <= n:
            c[j] = False
            j += i
        i += 1
"""

#algo3 =
def algorithm_third(n):
    c = list(True for i in range(n))
    c[1] = False
    n = len(c) - 1
    i = 2
    a = 0
    while i <= n:
        if c[i]:
            j = i + 1
            while j <= n:
                if j % i == 0:
                    c[j] = False
                j += 1
                a += 1
        i += 1


algo4 = """
def algorithm_fourth(n):
    c = list(True for i in range(n))
    c[1] = False
    n = len(c) - 1
    i = 2
    a = 0
    while i <= n:
        j = 2
        while j < i:
            if i % j == 0:
                c[i] = False
            a += 1
            j += 1
        i += 1
"""
"""
algo5 = 
def algorithm_fifth(n):
    c = list(True for i in range(n))
    c[1] = False
    n = len(c) - 1
    i = 2
    while i <= n:
        j = 2
        while j <= sqrt(i):
            if i % j == 0:
                c[i] = False
            j += 1
        i += 1


going_through = [10 for i in range(5)]
for i in range(1, 5):
    going_through[i] = going_through[i-1] * 10


arr1 = []
arr2 = []
arr3 = []
arr4 = []
arr5 = []

for i in going_through:
    res1 = timeit.repeat(stmt=module + algo1 + f"algorithm_first({i})", number=1, repeat=1)
    res2 = timeit.repeat(stmt=module + algo2 + f"algorithm_second({i})", number=1, repeat=1)
    res3 = timeit.repeat(stmt=module + algo3 + f"algorithm_third({i})", number=1, repeat=1)
    res4 = timeit.repeat(stmt=module + algo4 + f"algorithm_fourth({i})", number=1, repeat=1)
    res5 = timeit.repeat(stmt=module + algo5 + f"algorithm_fifth({i})", number=1, repeat=1)

    arr1.append(res1[0])
    arr2.append(res2[0])
    arr3.append(res3[0])
    arr4.append(res4[0])
    arr5.append(res5[0])


plt.plot(arr1[:],  label="First Algo")
plt.plot(arr2[:],  label="Second Algo")
plt.plot(arr3[:],  label="Third Algo")
plt.plot(arr4[:],  label="Fourth Algo")
plt.plot(arr5[:],  label="Fifth Algo")
plt.xlabel("Range")
plt.ylabel("Seconds")
plt.legend()
plt.show()
"""

algorithm_third(100)