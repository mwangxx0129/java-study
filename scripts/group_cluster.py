import heapq

def get_max_cluster_size(booting_power, processing_power, power_max):
    n = len(booting_power)
    pre_sum = [0] * (n + 1)
    for i, e in enumerate(processing_power):
        pre_sum[i + 1] = pre_sum[i] + e

    print(pre_sum)
    max_heap = []
    max_size = 0
    start = 0
    end = 0
    while start <= end < n:
        heapq.heappush(max_heap, -booting_power[end])
        cur_power = - max_heap[0] + (pre_sum[end + 1] - pre_sum[start]) * (end - start + 1)
        if cur_power <= power_max:
            max_size = max(max_size, (end - start + 1))
            end += 1
        else:
            max_heap.remove(-booting_power[start])
            heapq.heapify(max_heap)
            start += 1
    return max_size


if __name__ == '__main__':
    res = get_max_cluster_size([3, 6, 1, 3, 4], [2, 1, 3, 4, 5], 25)
    print(res)
